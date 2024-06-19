import java.util.Optional;
import java.util.ServiceLoader;
public abstract class ServiceProvider {
    // Metode statis untuk mendapatkan implementasi default dari ServiceProvider
    public static ServiceProvider getDefault() {
        // Memuat layanan yang mengimplementasikan ServiceProvider menggunakan ServiceLoader
        ServiceLoader<ServiceProvider> serviceLoader = ServiceLoader.load(ServiceProvider.class);

        // Mengambil implementasi pertama dari layanan yang ditemukan
        Optional<ServiceProvider> serviceProvider = serviceLoader.findFirst();
        // Mengembalikan implementasi layanan yang ditemukan
        return serviceProvider.get();
    }
    // Metode abstrak yang harus diimplementasikan oleh penyedia layanan
    public abstract String getMessage();

    public static void main(String[] args) {
        // Mendapatkan implementasi default dari ServiceProvider
        ServiceProvider provider = ServiceProvider.getDefault();
        // Mencetak pesan yang dikembalikan oleh implementasi getMessage
        System.out.println(provider.getMessage());
    }
}

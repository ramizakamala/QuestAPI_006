import android.app.Application
import com.example.pertemuan12.Dependeciesinjection.AppContainer
import com.example.pertemuan12.Dependeciesinjection.MahasiswaContainer

class MahasiswaApplications:Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}
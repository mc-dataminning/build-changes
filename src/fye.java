import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fye {
   private static final Logger a = LogUtils.getLogger();
   private final fft b;
   private final guu c;
   private final ak d = new ak();
   private final Map<af, ah> e = new Object2ObjectOpenHashMap();
   @Nullable
   private fye.a f;
   @Nullable
   private af g;

   public fye(fft $$0, guu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(afs $$0) {
      if ($$0.g()) {
         this.d.a();
         this.e.clear();
      }

      this.d.a($$0.e());
      this.d.a($$0.b());

      for (Entry<akk, ah> $$1 : $$0.f().entrySet()) {
         ag $$2 = this.d.a($$1.getKey());
         if ($$2 != null) {
            ah $$3 = $$1.getValue();
            $$3.a($$2.a().f());
            this.e.put($$2.b(), $$3);
            if (this.f != null) {
               this.f.a($$2, $$3);
            }

            if (!$$0.g() && $$3.a()) {
               if (this.b.r != null) {
                  this.c.a(this.b.r, $$2.b());
               }

               Optional<ar> $$4 = $$2.a().c();
               if ($$4.isPresent() && $$4.get().h()) {
                  this.b.ax().a(new fjy($$2.b()));
               }
            }
         } else {
            a.warn("Server informed client about progress for unknown advancement {}", $$1.getKey());
         }
      }
   }

   public ak a() {
      return this.d;
   }

   public void a(@Nullable af $$0, boolean $$1) {
      fyk $$2 = this.b.L();
      if ($$2 != null && $$0 != null && $$1) {
         $$2.b(ahl.a($$0));
      }

      if (this.g != $$0) {
         this.g = $$0;
         if (this.f != null) {
            this.f.a($$0);
         }
      }
   }

   public void a(@Nullable fye.a $$0) {
      this.f = $$0;
      this.d.a($$0);
      if ($$0 != null) {
         this.e.forEach(($$1, $$2) -> {
            ag $$3 = this.d.a($$1);
            if ($$3 != null) {
               $$0.a($$3, $$2);
            }
         });
         $$0.a(this.g);
      }
   }

   @Nullable
   public af a(akk $$0) {
      ag $$1 = this.d.a($$0);
      return $$1 != null ? $$1.b() : null;
   }

   public interface a extends ak.a {
      void a(ag var1, ah var2);

      void a(@Nullable af var1);
   }
}

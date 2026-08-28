import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfe {
   private static final Logger a = LogUtils.getLogger();
   private final fmf b;
   private final hgz c;
   private final am d = new am();
   private final Map<ah, aj> e = new Object2ObjectOpenHashMap();
   @Nullable
   private gfe.a f;
   @Nullable
   private ah g;

   public gfe(fmf $$0, hgz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(ahd $$0) {
      if ($$0.g()) {
         this.d.a();
         this.e.clear();
      }

      this.d.a($$0.e());
      this.d.a($$0.b());

      for (Entry<alz, aj> $$1 : $$0.f().entrySet()) {
         ai $$2 = this.d.a($$1.getKey());
         if ($$2 != null) {
            aj $$3 = $$1.getValue();
            $$3.a($$2.a().f());
            this.e.put($$2.b(), $$3);
            if (this.f != null) {
               this.f.a($$2, $$3);
            }

            if (!$$0.g() && $$3.a()) {
               if (this.b.s != null) {
                  this.c.a(this.b.s, $$2.b());
               }

               Optional<at> $$4 = $$2.a().c();
               if ($$4.isPresent() && $$4.get().h()) {
                  this.b.aA().a(new fqm($$2.b()));
               }
            }
         } else {
            a.warn("Server informed client about progress for unknown advancement {}", $$1.getKey());
         }
      }
   }

   public am a() {
      return this.d;
   }

   public void a(@Nullable ah $$0, boolean $$1) {
      gfk $$2 = this.b.L();
      if ($$2 != null && $$0 != null && $$1) {
         $$2.b(aix.a($$0));
      }

      if (this.g != $$0) {
         this.g = $$0;
         if (this.f != null) {
            this.f.a($$0);
         }
      }
   }

   public void a(@Nullable gfe.a $$0) {
      this.f = $$0;
      this.d.a($$0);
      if ($$0 != null) {
         this.e.forEach(($$1, $$2) -> {
            ai $$3 = this.d.a($$1);
            if ($$3 != null) {
               $$0.a($$3, $$2);
            }
         });
         $$0.a(this.g);
      }
   }

   @Nullable
   public ah a(alz $$0) {
      ai $$1 = this.d.a($$0);
      return $$1 != null ? $$1.b() : null;
   }

   public interface a extends am.a {
      void a(ai var1, aj var2);

      void a(@Nullable ah var1);
   }
}

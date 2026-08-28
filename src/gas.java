import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gas {
   private static final Logger a = LogUtils.getLogger();
   private final fib b;
   private final hbw c;
   private final al d = new al();
   private final Map<ag, ai> e = new Object2ObjectOpenHashMap();
   @Nullable
   private gas.a f;
   @Nullable
   private ag g;

   public gas(fib $$0, hbw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(agh $$0) {
      if ($$0.g()) {
         this.d.a();
         this.e.clear();
      }

      this.d.a($$0.e());
      this.d.a($$0.b());

      for (Entry<alb, ai> $$1 : $$0.f().entrySet()) {
         ah $$2 = this.d.a($$1.getKey());
         if ($$2 != null) {
            ai $$3 = $$1.getValue();
            $$3.a($$2.a().f());
            this.e.put($$2.b(), $$3);
            if (this.f != null) {
               this.f.a($$2, $$3);
            }

            if (!$$0.g() && $$3.a()) {
               if (this.b.s != null) {
                  this.c.a(this.b.s, $$2.b());
               }

               Optional<as> $$4 = $$2.a().c();
               if ($$4.isPresent() && $$4.get().h()) {
                  this.b.az().a(new fmh($$2.b()));
               }
            }
         } else {
            a.warn("Server informed client about progress for unknown advancement {}", $$1.getKey());
         }
      }
   }

   public al a() {
      return this.d;
   }

   public void a(@Nullable ag $$0, boolean $$1) {
      gay $$2 = this.b.L();
      if ($$2 != null && $$0 != null && $$1) {
         $$2.b(aib.a($$0));
      }

      if (this.g != $$0) {
         this.g = $$0;
         if (this.f != null) {
            this.f.a($$0);
         }
      }
   }

   public void a(@Nullable gas.a $$0) {
      this.f = $$0;
      this.d.a($$0);
      if ($$0 != null) {
         this.e.forEach(($$1, $$2) -> {
            ah $$3 = this.d.a($$1);
            if ($$3 != null) {
               $$0.a($$3, $$2);
            }
         });
         $$0.a(this.g);
      }
   }

   @Nullable
   public ag a(alb $$0) {
      ah $$1 = this.d.a($$0);
      return $$1 != null ? $$1.b() : null;
   }

   public interface a extends al.a {
      void a(ah var1, ai var2);

      void a(@Nullable ag var1);
   }
}

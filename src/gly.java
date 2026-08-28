import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gly {
   private static final Logger a = LogUtils.getLogger();
   private final frf b;
   private final hqs c;
   private final ao d = new ao();
   private final Map<aj, al> e = new Object2ObjectOpenHashMap();
   @Nullable
   private gly.a f;
   @Nullable
   private aj g;

   public gly(frf $$0, hqs $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(agk $$0) {
      if ($$0.g()) {
         this.d.a();
         this.e.clear();
      }

      this.d.a($$0.e());
      this.d.a($$0.b());

      for (Entry<alk, al> $$1 : $$0.f().entrySet()) {
         ak $$2 = this.d.a($$1.getKey());
         if ($$2 != null) {
            al $$3 = $$1.getValue();
            $$3.a($$2.a().f());
            this.e.put($$2.b(), $$3);
            if (this.f != null) {
               this.f.a($$2, $$3);
            }

            if (!$$0.g() && $$3.a()) {
               if (this.b.s != null) {
                  this.c.a(this.b.s, $$2.b());
               }

               Optional<av> $$4 = $$2.a().c();
               if ($$0.h() && $$4.isPresent() && $$4.get().h()) {
                  this.b.aA().a(new fwu($$2.b()));
               }
            }
         } else {
            a.warn("Server informed client about progress for unknown advancement {}", $$1.getKey());
         }
      }
   }

   public ao a() {
      return this.d;
   }

   public void a(@Nullable aj $$0, boolean $$1) {
      gme $$2 = this.b.L();
      if ($$2 != null && $$0 != null && $$1) {
         $$2.b(aig.a($$0));
      }

      if (this.g != $$0) {
         this.g = $$0;
         if (this.f != null) {
            this.f.a($$0);
         }
      }
   }

   public void a(@Nullable gly.a $$0) {
      this.f = $$0;
      this.d.a($$0);
      if ($$0 != null) {
         this.e.forEach(($$1, $$2) -> {
            ak $$3 = this.d.a($$1);
            if ($$3 != null) {
               $$0.a($$3, $$2);
            }
         });
         $$0.a(this.g);
      }
   }

   @Nullable
   public aj a(alk $$0) {
      ak $$1 = this.d.a($$0);
      return $$1 != null ? $$1.b() : null;
   }

   public interface a extends ao.a {
      void a(ak var1, al var2);

      void a(@Nullable aj var1);
   }
}

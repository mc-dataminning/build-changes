import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class gtd {
   private final Map<iu, dwx> a;
   @Nullable
   private final List<eco<dzz>> b;
   private final boolean c;
   private final ecg d;

   gtd(ecg $$0) {
      this.d = $$0;
      this.c = $$0.H().ak();
      this.a = ImmutableMap.copyOf($$0.I());
      if ($$0 instanceof ecc) {
         this.b = null;
      } else {
         ech[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (ech $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dwx a(iu $$0) {
      return this.a.get($$0);
   }

   public dzz b(iu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         dzz $$4 = null;
         if ($$2 == 60) {
            $$4 = dmc.iv.m();
         }

         if ($$2 == 70) {
            $$4 = efp.a($$1, $$3);
         }

         return $$4 == null ? dmc.a.m() : $$4;
      } else if (this.b == null) {
         return dmc.a.m();
      } else {
         try {
            int $$5 = this.d.f($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               eco<dzz> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dmc.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this.d, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }
}

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class gqh {
   private final Map<ji, dus> a;
   @Nullable
   private final List<eae<dxq>> b;
   private final boolean c;
   private final dzw d;

   gqh(dzw $$0) {
      this.d = $$0;
      this.c = $$0.H().ak();
      this.a = ImmutableMap.copyOf($$0.I());
      if ($$0 instanceof dzs) {
         this.b = null;
      } else {
         dzx[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (dzx $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dus a(ji $$0) {
      return this.a.get($$0);
   }

   public dxq b(ji $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         dxq $$4 = null;
         if ($$2 == 60) {
            $$4 = dkg.iu.m();
         }

         if ($$2 == 70) {
            $$4 = edf.a($$1, $$3);
         }

         return $$4 == null ? dkg.a.m() : $$4;
      } else if (this.b == null) {
         return dkg.a.m();
      } else {
         try {
            int $$5 = this.d.f($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               eae<dxq> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dkg.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this.d, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }
}

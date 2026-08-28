import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class gvo {
   private final Map<iw, dye> a;
   @Nullable
   private final List<edv<ebg>> b;
   private final boolean c;
   private final edn d;

   gvo(edn $$0) {
      this.d = $$0;
      this.c = $$0.H().ak();
      this.a = ImmutableMap.copyOf($$0.I());
      if ($$0 instanceof edj) {
         this.b = null;
      } else {
         edo[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (edo $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dye a(iw $$0) {
      return this.a.get($$0);
   }

   public ebg b(iw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         ebg $$4 = null;
         if ($$2 == 60) {
            $$4 = dng.iy.m();
         }

         if ($$2 == 70) {
            $$4 = egw.a($$1, $$3);
         }

         return $$4 == null ? dng.a.m() : $$4;
      } else if (this.b == null) {
         return dng.a.m();
      } else {
         try {
            int $$5 = this.d.f($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               edv<ebg> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dng.a.m();
         } catch (Throwable var8) {
            p $$8 = p.a(var8, "Getting block state");
            q $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> q.a(this.d, $$1, $$2, $$3));
            throw new aa($$8);
         }
      }
   }
}

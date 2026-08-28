import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class guz {
   private final Map<iw, dyo> a;
   @Nullable
   private final List<eef<ebq>> b;
   private final boolean c;
   private final edx d;

   guz(edx $$0) {
      this.d = $$0;
      this.c = $$0.H().ak();
      this.a = ImmutableMap.copyOf($$0.I());
      if ($$0 instanceof edt) {
         this.b = null;
      } else {
         edy[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (edy $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dyo a(iw $$0) {
      return this.a.get($$0);
   }

   public ebq b(iw $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         ebq $$4 = null;
         if ($$2 == 60) {
            $$4 = dnq.iy.m();
         }

         if ($$2 == 70) {
            $$4 = ehg.a($$1, $$3);
         }

         return $$4 == null ? dnq.a.m() : $$4;
      } else if (this.b == null) {
         return dnq.a.m();
      } else {
         try {
            int $$5 = this.d.f($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               eef<ebq> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dnq.a.m();
         } catch (Throwable var8) {
            p $$8 = p.a(var8, "Getting block state");
            q $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> q.a(this.d, $$1, $$2, $$3));
            throw new aa($$8);
         }
      }
   }
}

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class gid {
   private final Map<ir, dqc> a;
   @Nullable
   private final List<dvq<dtc>> b;
   private final boolean c;
   private final dvi d;

   gid(dvi $$0) {
      this.d = $$0;
      this.c = $$0.G().ai();
      this.a = ImmutableMap.copyOf($$0.H());
      if ($$0 instanceof dve) {
         this.b = null;
      } else {
         dvj[] $$1 = $$0.e();
         this.b = new ArrayList<>($$1.length);

         for (dvj $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dqc a(ir $$0) {
      return this.a.get($$0);
   }

   public dtc b(ir $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         dtc $$4 = null;
         if ($$2 == 60) {
            $$4 = dfe.iQ.n();
         }

         if ($$2 == 70) {
            $$4 = dyl.a($$1, $$3);
         }

         return $$4 == null ? dfe.a.n() : $$4;
      } else if (this.b == null) {
         return dfe.a.n();
      } else {
         try {
            int $$5 = this.d.e($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               dvq<dtc> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dfe.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this.d, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }
}

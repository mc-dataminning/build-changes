import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class gkp {
   private final Map<je, drs> a;
   @Nullable
   private final List<dxc<duo>> b;
   private final boolean c;
   private final dwu d;

   gkp(dwu $$0) {
      this.d = $$0;
      this.c = $$0.E().aj();
      this.a = ImmutableMap.copyOf($$0.F());
      if ($$0 instanceof dwq) {
         this.b = null;
      } else {
         dwv[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (dwv $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public drs a(je $$0) {
      return this.a.get($$0);
   }

   public duo b(je $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         duo $$4 = null;
         if ($$2 == 60) {
            $$4 = dhl.hW.o();
         }

         if ($$2 == 70) {
            $$4 = eab.a($$1, $$3);
         }

         return $$4 == null ? dhl.a.o() : $$4;
      } else if (this.b == null) {
         return dhl.a.o();
      } else {
         try {
            int $$5 = this.d.f($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               dxc<duo> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dhl.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this.d, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }
}

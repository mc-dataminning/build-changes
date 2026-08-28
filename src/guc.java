import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class guc {
   private final Map<iv, dxr> a;
   @Nullable
   private final List<edi<eat>> b;
   private final boolean c;
   private final eda d;

   guc(eda $$0) {
      this.d = $$0;
      this.c = $$0.H().ak();
      this.a = ImmutableMap.copyOf($$0.I());
      if ($$0 instanceof ecw) {
         this.b = null;
      } else {
         edb[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (edb $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dxr a(iv $$0) {
      return this.a.get($$0);
   }

   public eat b(iv $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         eat $$4 = null;
         if ($$2 == 60) {
            $$4 = dmt.iy.m();
         }

         if ($$2 == 70) {
            $$4 = egj.a($$1, $$3);
         }

         return $$4 == null ? dmt.a.m() : $$4;
      } else if (this.b == null) {
         return dmt.a.m();
      } else {
         try {
            int $$5 = this.d.f($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               edi<eat> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dmt.a.m();
         } catch (Throwable var8) {
            p $$8 = p.a(var8, "Getting block state");
            q $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> q.a(this.d, $$1, $$2, $$3));
            throw new aa($$8);
         }
      }
   }
}

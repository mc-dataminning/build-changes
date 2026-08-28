import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class glf {
   private final Map<jg, dsg> a;
   @Nullable
   private final List<dxr<dvd>> b;
   private final boolean c;
   private final dxj d;

   glf(dxj $$0) {
      this.d = $$0;
      this.c = $$0.E().aj();
      this.a = ImmutableMap.copyOf($$0.F());
      if ($$0 instanceof dxf) {
         this.b = null;
      } else {
         dxk[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (dxk $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dsg a(jg $$0) {
      return this.a.get($$0);
   }

   public dvd b(jg $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         dvd $$4 = null;
         if ($$2 == 60) {
            $$4 = dia.hW.m();
         }

         if ($$2 == 70) {
            $$4 = eaq.a($$1, $$3);
         }

         return $$4 == null ? dia.a.m() : $$4;
      } else if (this.b == null) {
         return dia.a.m();
      } else {
         try {
            int $$5 = this.d.f($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               dxr<dvd> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return dia.a.m();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this.d, $$1, $$2, $$3));
            throw new z($$8);
         }
      }
   }
}

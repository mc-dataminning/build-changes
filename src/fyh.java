import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class fyh {
   private final Map<hz, dit> a;
   @Nullable
   private final List<dnu<dlf>> b;
   private final boolean c;
   private final dnm d;

   fyh(dnm $$0) {
      this.d = $$0;
      this.c = $$0.F().ah();
      this.a = ImmutableMap.copyOf($$0.G());
      if ($$0 instanceof dni) {
         this.b = null;
      } else {
         dnn[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (dnn $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dit a(hz $$0) {
      return this.a.get($$0);
   }

   public dlf b(hz $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         dlf $$4 = null;
         if ($$2 == 60) {
            $$4 = cyq.hW.o();
         }

         if ($$2 == 70) {
            $$4 = dqf.a($$1, $$3);
         }

         return $$4 == null ? cyq.a.o() : $$4;
      } else if (this.b == null) {
         return cyq.a.o();
      } else {
         try {
            int $$5 = this.d.e($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               dnu<dlf> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cyq.a.o();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this.d, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }
}

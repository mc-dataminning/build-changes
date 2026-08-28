import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;

public interface wb {
   wb a = new wb() {
      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public boolean a(dak $$0, wa.a $$1) {
         return $$0.f();
      }
   };
   ze<wp, wb> b = zc.a(wb.a.c).a($$0 -> (wb)DataFixUtils.orElse($$0, a), $$0 -> $$0 instanceof wb.a $$1 ? Optional.of($$1) : Optional.empty());

   boolean a(dak var1, wa.a var2);

   static wb b(dak $$0, wa.a $$1) {
      return (wb)($$0.f() ? a : new wb.a($$0.i(), $$0.M(), wa.a($$0.d(), $$1)));
   }

   public static record a(jg<dag> d, int e, wa f) implements wb {
      public static final ze<wp, wb.a> c = ze.a(zc.b(mi.K), wb.a::a, zc.h, wb.a::b, wa.a, wb.a::c, wb.a::new);

      @Override
      public boolean a(dak $$0, wa.a $$1) {
         if (this.e != $$0.M()) {
            return false;
         } else {
            return !this.d.equals($$0.i()) ? false : this.f.b($$0.d(), $$1);
         }
      }

      public jg<dag> a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public wa c() {
         return this.f;
      }
   }
}

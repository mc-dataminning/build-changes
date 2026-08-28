import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hkd implements hkg<ki> {
   private final gju a;

   public hkd(gju $$0) {
      this.a = $$0;
   }

   @Nullable
   public ki a(daa $$0) {
      return $$0.e();
   }

   public void a(@Nullable ki $$0, czy $$1, flq $$2, gsc $$3, int $$4, int $$5, boolean $$6) {
      dxu $$7 = $$0 != null ? $$0.a(kl.am, dxu.a) : dxu.a;
      cyy $$8 = $$0 != null ? $$0.a(kl.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hnj $$10 = $$9 ? hnm.g : hnm.h;
      flt $$11 = $$10.c().a(gzi.a($$3, this.a.a($$10.a()), $$1 == czy.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         guk.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cyy.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hkg.a {
      public static final hkd.a a = new hkd.a();
      public static final MapCodec<hkd.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hkd.a> a() {
         return b;
      }

      @Override
      public hkg<?> a(glc $$0) {
         return new hkd(new gju($$0.a(glf.cT)));
      }
   }
}

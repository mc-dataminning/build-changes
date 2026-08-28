import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdt implements hdw<kr> {
   private final gds a;

   public hdt(gds $$0) {
      this.a = $$0;
   }

   @Nullable
   public kr a(cwp $$0) {
      return $$0.e();
   }

   public void a(@Nullable kr $$0, cwn $$1, ffu $$2, gly $$3, int $$4, int $$5, boolean $$6) {
      dtq $$7 = $$0 != null ? $$0.a(kv.ai, dtq.a) : dtq.a;
      cvm $$8 = $$0 != null ? $$0.a(kv.aj) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hgz $$10 = $$9 ? hhc.g : hhc.h;
      ffy $$11 = $$10.c().a(gtc.a($$3, this.a.a($$10.a()), $$1 == cwn.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gof.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cvm.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hdw.a {
      public static final hdt.a a = new hdt.a();
      public static final MapCodec<hdt.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hdt.a> a() {
         return b;
      }

      @Override
      public hdw<?> a(gez $$0) {
         return new hdt(new gds($$0.a(gfc.cD)));
      }
   }
}

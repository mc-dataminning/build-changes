import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdl implements hdo<kr> {
   private final gdr a;

   public hdl(gdr $$0) {
      this.a = $$0;
   }

   @Nullable
   public kr a(cwp $$0) {
      return $$0.e();
   }

   public void a(@Nullable kr $$0, cwn $$1, ffu $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      dtq $$7 = $$0 != null ? $$0.a(kv.ai, dtq.a) : dtq.a;
      cvm $$8 = $$0 != null ? $$0.a(kv.aj) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hgs $$10 = $$9 ? hgv.g : hgv.h;
      ffy $$11 = $$10.c().a(gta.a($$3, this.a.a($$10.a()), $$1 == cwn.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         god.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cvm.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hdo.a {
      public static final hdl.a a = new hdl.a();
      public static final MapCodec<hdl.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hdl.a> a() {
         return b;
      }

      @Override
      public hdo<?> a(gey $$0) {
         return new hdl(new gdr($$0.a(gfb.cD)));
      }
   }
}

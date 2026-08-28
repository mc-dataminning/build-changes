import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gra implements gqk<dxb> {
   private final Function<dsc.a, gfy> a;
   private static final Map<dsc.a, ald> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dsc.b.c, ald.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dsc.b.d, ald.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dsc.b.f, ald.b("textures/entity/zombie/zombie.png"));
      $$0.put(dsc.b.g, ald.b("textures/entity/creeper/creeper.png"));
      $$0.put(dsc.b.i, ald.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dsc.b.h, ald.b("textures/entity/piglin/piglin.png"));
      $$0.put(dsc.b.e, hhl.a());
   });

   @Nullable
   public static gfy a(ggz $$0, dsc.a $$1) {
      if ($$1 instanceof dsc.b $$2) {
         return (gfy)(switch ($$2) {
            case c -> new gfx($$0.a(ghc.cZ));
            case d -> new gfx($$0.a(ghc.dR));
            case e -> new gfx($$0.a(ghc.cr));
            case f -> new gfx($$0.a(ghc.ed));
            case g -> new gfx($$0.a(ghc.ao));
            case i -> new ggw($$0.a(ghc.aB));
            case h -> new gfc($$0.a(ghc.ch));
         });
      } else {
         return null;
      }
   }

   public gra(gql.a $$0) {
      ggz $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dxb $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dym $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dud;
      jo $$9 = $$8 ? $$7.c(dud.d) : null;
      int $$10 = $$8 ? dzs.a($$9.g()) : $$7.c(dsc.e);
      float $$11 = dzs.b($$10);
      dsc.a $$12 = ((djq)$$7.b()).b();
      gfy $$13 = this.a.apply($$12);
      goi $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jo $$0, float $$1, float $$2, fho $$3, gny $$4, int $$5, gfy $$6, goi $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fhs $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hgi.d);
      $$3.b();
   }

   public static goi a(dsc.a $$0, @Nullable dau $$1) {
      return a($$0, $$1, null);
   }

   public static goi a(dsc.a $$0, @Nullable dau $$1, @Nullable ald $$2) {
      return $$0 == dsc.b.e && $$1 != null ? goi.j($$2 != null ? $$2 : fnd.Q().an().b($$1.f()).a()) : goi.h($$2 != null ? $$2 : b.get($$0));
   }
}

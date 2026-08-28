import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gow implements goh<dvm> {
   private final Function<dqr.a, gdv> a;
   private static final Map<dqr.a, aku> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dqr.b.c, aku.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dqr.b.d, aku.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dqr.b.f, aku.b("textures/entity/zombie/zombie.png"));
      $$0.put(dqr.b.g, aku.b("textures/entity/creeper/creeper.png"));
      $$0.put(dqr.b.i, aku.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dqr.b.h, aku.b("textures/entity/piglin/piglin.png"));
      $$0.put(dqr.b.e, hff.a());
   });

   @Nullable
   public static gdv a(gew $$0, dqr.a $$1) {
      if ($$1 instanceof dqr.b $$2) {
         return (gdv)(switch ($$2) {
            case c -> new gdu($$0.a(gez.cN));
            case d -> new gdu($$0.a(gez.dF));
            case e -> new gdu($$0.a(gez.ch));
            case f -> new gdu($$0.a(gez.dR));
            case g -> new gdu($$0.a(gez.ak));
            case i -> new get($$0.a(gez.av));
            case h -> new gcz($$0.a(gez.bX));
         });
      } else {
         return null;
      }
   }

   public gow(goi.a $$0) {
      gew $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dvm $$0, float $$1, ffs $$2, glv $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dwv $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dsq;
      jn $$9 = $$8 ? $$7.c(dsq.d) : null;
      int $$10 = $$8 ? dya.a($$9.g()) : $$7.c(dqr.e);
      float $$11 = dya.b($$10);
      dqr.a $$12 = ((dig)$$7.b()).b();
      gdv $$13 = this.a.apply($$12);
      gmf $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jn $$0, float $$1, float $$2, ffs $$3, glv $$4, int $$5, gdv $$6, gmf $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ffw $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hec.d);
      $$3.b();
   }

   public static gmf a(dqr.a $$0, @Nullable czm $$1) {
      return a($$0, $$1, null);
   }

   public static gmf a(dqr.a $$0, @Nullable czm $$1, @Nullable aku $$2) {
      return $$0 == dqr.b.e && $$1 != null ? gmf.j($$2 != null ? $$2 : flh.Q().an().b($$1.f()).a()) : gmf.h($$2 != null ? $$2 : b.get($$0));
   }
}

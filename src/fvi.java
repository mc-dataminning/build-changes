import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fvi extends fwb<cfs> {
   private final Map<cfs.b, Pair<agm, fim<cfs>>> a;

   public fvi(fwc.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cfs.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new agm(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fim<cfs> a(fwc.a $$0, cfs.b $$1, boolean $$2) {
      fkr $$3 = $$2 ? fks.d($$1) : fks.c($$1);
      fkt $$4 = $$0.a($$3);
      if ($$1 == cfs.b.i) {
         return (fim<cfs>)($$2 ? new fhh($$4) : new fjg($$4));
      } else {
         return (fim<cfs>)($$2 ? new fhg($$4) : new fhc($$4));
      }
   }

   private static String a(cfs.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cfs $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(atq.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!atq.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<agm, fim<cfs>> $$9 = this.a.get($$0.y());
      agm $$10 = (agm)$$9.getFirst();
      fim<cfs> $$11 = (fim<cfs>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eof $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         eof $$13 = $$4.getBuffer(frh.i());
         if ($$11 instanceof fkh $$14) {
            $$14.c().a($$3, $$13, $$5, gbq.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agm a(cfs $$0) {
      return (agm)this.a.get($$0.y()).getFirst();
   }
}

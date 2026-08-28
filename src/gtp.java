import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface gtp {
   void a(azz var1, List<gto> var2);

   default List<gto> a(azz $$0) {
      List<gto> $$1 = new ObjectArrayList();
      this.a($$0, $$1);
      return $$1;
   }

   hlc a();

   public static class a implements gtp.c {
      final gtp.b a;
      private final hnl.a<gtp> b = new hnl.a<gtp>() {
         public gtp a(hnl $$0) {
            return a.this.a.a($$0);
         }
      };

      public a(gtp.b $$0) {
         this.a = $$0;
      }

      @Override
      public void a(hnt.a $$0) {
         this.a.a($$0);
      }

      @Override
      public gtp a(ebg $$0, hnl $$1) {
         return $$1.a(this.b);
      }

      @Override
      public Object a(ebg $$0) {
         return this;
      }
   }

   public interface b extends hnt {
      Codec<btc<gty>> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gty.a.forGetter(btc::a), ayy.m.optionalFieldOf("weight", 1).forGetter(btc::b)).apply($$0, btc::new)
      );
      Codec<hny.a> b = ayy.b(a.listOf()).flatComapMap($$0 -> new hny.a(btd.a(Lists.transform($$0, $$0x -> $$0x.a(gtw.a::new)))), $$0 -> {
         List<btc<gtp.b>> $$1 = $$0.b().d();
         List<btc<gty>> $$2 = new ArrayList<>($$1.size());

         for (btc<gtp.b> $$3 : $$1) {
            if (!($$3.a() instanceof gtw.a $$5)) {
               return DataResult.error(() -> "Only single variants are supported");
            }

            $$2.add(new btc<>($$5.b(), $$3.b()));
         }

         return DataResult.success($$2);
      });
      Codec<gtp.b> c = Codec.either(b, gtw.a.d).flatComapMap($$0 -> (gtp.b)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gtw.a $$3 -> DataResult.success(Either.right($$3));
            case hny.a $$4 -> DataResult.success(Either.left($$4));
            default -> DataResult.error(() -> "Only a single variant or a list of variants are supported");
         };
      });

      gtp a(hnl var1);

      default gtp.c a() {
         return new gtp.a(this);
      }
   }

   public interface c extends hnt {
      gtp a(ebg var1, hnl var2);

      Object a(ebg var1);
   }
}

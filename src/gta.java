import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface gta {
   void a(bai var1, List<gsz> var2);

   default List<gsz> a(bai $$0) {
      List<gsz> $$1 = new ObjectArrayList();
      this.a($$0, $$1);
      return $$1;
   }

   hkq a();

   public static class a implements gta.c {
      final gta.b a;
      private final hmz.a<gta> b = new hmz.a<gta>() {
         public gta a(hmz $$0) {
            return a.this.a.a($$0);
         }
      };

      public a(gta.b $$0) {
         this.a = $$0;
      }

      @Override
      public void a(hnh.a $$0) {
         this.a.a($$0);
      }

      @Override
      public gta a(ebq $$0, hmz $$1) {
         return $$1.a(this.b);
      }

      @Override
      public Object a(ebq $$0) {
         return this;
      }
   }

   public interface b extends hnh {
      Codec<btl<gtj>> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gtj.a.forGetter(btl::a), azg.m.optionalFieldOf("weight", 1).forGetter(btl::b)).apply($$0, btl::new)
      );
      Codec<hnm.a> b = azg.b(a.listOf()).flatComapMap($$0 -> new hnm.a(btm.a(Lists.transform($$0, $$0x -> $$0x.a(gth.a::new)))), $$0 -> {
         List<btl<gta.b>> $$1 = $$0.b().d();
         List<btl<gtj>> $$2 = new ArrayList<>($$1.size());

         for (btl<gta.b> $$3 : $$1) {
            if (!($$3.a() instanceof gth.a $$5)) {
               return DataResult.error(() -> "Only single variants are supported");
            }

            $$2.add(new btl<>($$5.b(), $$3.b()));
         }

         return DataResult.success($$2);
      });
      Codec<gta.b> c = Codec.either(b, gth.a.d).flatComapMap($$0 -> (gta.b)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gth.a $$3 -> DataResult.success(Either.right($$3));
            case hnm.a $$4 -> DataResult.success(Either.left($$4));
            default -> DataResult.error(() -> "Only a single variant or a list of variants are supported");
         };
      });

      gta a(hmz var1);

      default gta.c a() {
         return new gta.a(this);
      }
   }

   public interface c extends hnh {
      gta a(ebq var1, hmz var2);

      Object a(ebq var1);
   }
}

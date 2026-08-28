import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface gtn {
   void a(azx var1, List<gtm> var2);

   default List<gtm> a(azx $$0) {
      List<gtm> $$1 = new ObjectArrayList();
      this.a($$0, $$1);
      return $$1;
   }

   hla a();

   public static class a implements gtn.c {
      final gtn.b a;
      private final hnj.a<gtn> b = new hnj.a<gtn>() {
         public gtn a(hnj $$0) {
            return a.this.a.a($$0);
         }
      };

      public a(gtn.b $$0) {
         this.a = $$0;
      }

      @Override
      public void a(hnr.a $$0) {
         this.a.a($$0);
      }

      @Override
      public gtn a(ebe $$0, hnj $$1) {
         return $$1.a(this.b);
      }

      @Override
      public Object a(ebe $$0) {
         return this;
      }
   }

   public interface b extends hnr {
      Codec<bta<gtw>> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gtw.a.forGetter(bta::a), ayw.m.optionalFieldOf("weight", 1).forGetter(bta::b)).apply($$0, bta::new)
      );
      Codec<hnw.a> b = ayw.b(a.listOf()).flatComapMap($$0 -> new hnw.a(btb.a(Lists.transform($$0, $$0x -> $$0x.a(gtu.a::new)))), $$0 -> {
         List<bta<gtn.b>> $$1 = $$0.b().d();
         List<bta<gtw>> $$2 = new ArrayList<>($$1.size());

         for (bta<gtn.b> $$3 : $$1) {
            if (!($$3.a() instanceof gtu.a $$5)) {
               return DataResult.error(() -> "Only single variants are supported");
            }

            $$2.add(new bta<>($$5.b(), $$3.b()));
         }

         return DataResult.success($$2);
      });
      Codec<gtn.b> c = Codec.either(b, gtu.a.d).flatComapMap($$0 -> (gtn.b)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         Objects.requireNonNull($$0);

         return switch ($$0) {
            case gtu.a $$3 -> DataResult.success(Either.right($$3));
            case hnw.a $$4 -> DataResult.success(Either.left($$4));
            default -> DataResult.error(() -> "Only a single variant or a list of variants are supported");
         };
      });

      gtn a(hnj var1);

      default gtn.c a() {
         return new gtn.a(this);
      }
   }

   public interface c extends hnr {
      gtn a(ebe var1, hnj var2);

      Object a(ebe var1);
   }
}

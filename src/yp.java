import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yp(Either<hm, String> d, String e) implements xi {
   public static final MapCodec<yp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hm.a, Codec.STRING).fieldOf("name").forGetter(yp::b), Codec.STRING.fieldOf("objective").forGetter(yp::c))
            .apply($$0, yp::new)
   );
   public static final MapCodec<yp> b = a.fieldOf("score");
   public static final xi.a<yp> c = new xi.a<>(b, "score");

   @Override
   public xi.a<?> a() {
      return c;
   }

   private fal a(ev $$0) throws CommandSyntaxException {
      Optional<hm> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends btz> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fi.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fal.c($$1.get().a());
         }
      } else {
         return fal.c((String)this.d.right().orElseThrow());
      }
   }

   private xv a(fal $$0, ev $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fam $$3 = $$2.aJ();
         fae $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fai $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(za.b));
            }
         }
      }

      return xh.i();
   }

   @Override
   public xv a(@Nullable ev $$0, @Nullable btz $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xh.i();
      } else {
         fal $$3 = this.a($$0);
         fal $$4 = (fal)($$1 != null && $$3.equals(fal.cz) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hm, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}

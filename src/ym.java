import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record ym(Either<hl, String> d, String e) implements xf {
   public static final MapCodec<ym> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hl.a, Codec.STRING).fieldOf("name").forGetter(ym::b), Codec.STRING.fieldOf("objective").forGetter(ym::c))
            .apply($$0, ym::new)
   );
   public static final MapCodec<ym> b = a.fieldOf("score");
   public static final xf.a<ym> c = new xf.a<>(b, "score");

   @Override
   public xf.a<?> a() {
      return c;
   }

   private faa a(eu $$0) throws CommandSyntaxException {
      Optional<hl> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends btr> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fh.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return faa.c($$1.get().a());
         }
      } else {
         return faa.c((String)this.d.right().orElseThrow());
      }
   }

   private xs a(faa $$0, eu $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fab $$3 = $$2.aJ();
         ezt $$4 = $$3.a(this.e);
         if ($$4 != null) {
            ezx $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yx.b));
            }
         }
      }

      return xe.i();
   }

   @Override
   public xs a(@Nullable eu $$0, @Nullable btr $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xe.i();
      } else {
         faa $$3 = this.a($$0);
         faa $$4 = (faa)($$1 != null && $$3.equals(faa.cz) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hl, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}

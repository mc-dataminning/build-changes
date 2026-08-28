import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yi(Either<hb, String> d, String e) implements xb {
   public static final MapCodec<yi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hb.a, Codec.STRING).fieldOf("name").forGetter(yi::b), Codec.STRING.fieldOf("objective").forGetter(yi::c))
            .apply($$0, yi::new)
   );
   public static final MapCodec<yi> b = a.fieldOf("score");
   public static final xb.a<yi> c = new xb.a<>(b, "score");

   @Override
   public xb.a<?> a() {
      return c;
   }

   private fgu a(ej $$0) throws CommandSyntaxException {
      Optional<hb> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bwt> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw ew.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fgu.c($$1.get().a());
         }
      } else {
         return fgu.c((String)this.d.right().orElseThrow());
      }
   }

   private xo a(fgu $$0, ej $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fgv $$3 = $$2.aJ();
         fgn $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fgr $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yt.b));
            }
         }
      }

      return xa.i();
   }

   @Override
   public xo a(@Nullable ej $$0, @Nullable bwt $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xa.i();
      } else {
         fgu $$3 = this.a($$0);
         fgu $$4 = (fgu)($$1 != null && $$3.equals(fgu.cp) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hb, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}

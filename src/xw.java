import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record xw(Either<ho, String> d, String e) implements wp {
   public static final MapCodec<xw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ho.a, Codec.STRING).fieldOf("name").forGetter(xw::b), Codec.STRING.fieldOf("objective").forGetter(xw::c))
            .apply($$0, xw::new)
   );
   public static final MapCodec<xw> b = a.fieldOf("score");
   public static final wp.a<xw> c = new wp.a<>(b, "score");

   @Override
   public wp.a<?> a() {
      return c;
   }

   private fcc a(ex $$0) throws CommandSyntaxException {
      Optional<ho> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends buj> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fk.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fcc.c($$1.get().a());
         }
      } else {
         return fcc.c((String)this.d.right().orElseThrow());
      }
   }

   private xc a(fcc $$0, ex $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fcd $$3 = $$2.aJ();
         fbv $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fbz $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yh.b));
            }
         }
      }

      return wo.i();
   }

   @Override
   public xc a(@Nullable ex $$0, @Nullable buj $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wo.i();
      } else {
         fcc $$3 = this.a($$0);
         fcc $$4 = (fcc)($$1 != null && $$3.equals(fcc.cB) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<ho, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}

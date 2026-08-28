import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record xx(Either<ho, String> d, String e) implements wq {
   public static final MapCodec<xx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ho.a, Codec.STRING).fieldOf("name").forGetter(xx::b), Codec.STRING.fieldOf("objective").forGetter(xx::c))
            .apply($$0, xx::new)
   );
   public static final MapCodec<xx> b = a.fieldOf("score");
   public static final wq.a<xx> c = new wq.a<>(b, "score");

   @Override
   public wq.a<?> a() {
      return c;
   }

   private fdb a(ex $$0) throws CommandSyntaxException {
      Optional<ho> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bva> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fk.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fdb.c($$1.get().a());
         }
      } else {
         return fdb.c((String)this.d.right().orElseThrow());
      }
   }

   private xd a(fdb $$0, ex $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fdc $$3 = $$2.aJ();
         fcu $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fcy $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yi.b));
            }
         }
      }

      return wp.i();
   }

   @Override
   public xd a(@Nullable ex $$0, @Nullable bva $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wp.i();
      } else {
         fdb $$3 = this.a($$0);
         fdb $$4 = (fdb)($$1 != null && $$3.equals(fdb.co) ? $$1 : $$3);
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

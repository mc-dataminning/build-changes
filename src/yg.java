import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yg(Either<ha, String> d, String e) implements wz {
   public static final MapCodec<yg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ha.a, Codec.STRING).fieldOf("name").forGetter(yg::b), Codec.STRING.fieldOf("objective").forGetter(yg::c))
            .apply($$0, yg::new)
   );
   public static final MapCodec<yg> b = a.fieldOf("score");
   public static final wz.a<yg> c = new wz.a<>(b, "score");

   @Override
   public wz.a<?> a() {
      return c;
   }

   private ffu a(ei $$0) throws CommandSyntaxException {
      Optional<ha> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bwf> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw ev.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return ffu.c($$1.get().a());
         }
      } else {
         return ffu.c((String)this.d.right().orElseThrow());
      }
   }

   private xm a(ffu $$0, ei $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         ffv $$3 = $$2.aJ();
         ffn $$4 = $$3.a(this.e);
         if ($$4 != null) {
            ffr $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yr.b));
            }
         }
      }

      return wy.i();
   }

   @Override
   public xm a(@Nullable ei $$0, @Nullable bwf $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wy.i();
      } else {
         ffu $$3 = this.a($$0);
         ffu $$4 = (ffu)($$1 != null && $$3.equals(ffu.cp) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<ha, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record ye(Either<ha, String> d, String e) implements wx {
   public static final MapCodec<ye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ha.a, Codec.STRING).fieldOf("name").forGetter(ye::b), Codec.STRING.fieldOf("objective").forGetter(ye::c))
            .apply($$0, ye::new)
   );
   public static final MapCodec<ye> b = a.fieldOf("score");
   public static final wx.a<ye> c = new wx.a<>(b, "score");

   @Override
   public wx.a<?> a() {
      return c;
   }

   private ffa a(ei $$0) throws CommandSyntaxException {
      Optional<ha> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bwa> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw ev.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return ffa.c($$1.get().a());
         }
      } else {
         return ffa.c((String)this.d.right().orElseThrow());
      }
   }

   private xk a(ffa $$0, ei $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         ffb $$3 = $$2.aJ();
         fet $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fex $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yp.b));
            }
         }
      }

      return ww.i();
   }

   @Override
   public xk a(@Nullable ei $$0, @Nullable bwa $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return ww.i();
      } else {
         ffa $$3 = this.a($$0);
         ffa $$4 = (ffa)($$1 != null && $$3.equals(ffa.co) ? $$1 : $$3);
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

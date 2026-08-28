import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record zd(Either<hn, String> d, String e) implements xw {
   public static final MapCodec<zd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hn.a, Codec.STRING).fieldOf("name").forGetter(zd::b), Codec.STRING.fieldOf("objective").forGetter(zd::c))
            .apply($$0, zd::new)
   );
   public static final MapCodec<zd> b = a.fieldOf("score");
   public static final xw.a<zd> c = new xw.a<>(b, "score");

   @Override
   public xw.a<?> a() {
      return c;
   }

   private fdb a(ew $$0) throws CommandSyntaxException {
      Optional<hn> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bvj> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw fj.a.create();
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

   private yj a(fdb $$0, ew $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fdc $$3 = $$2.aJ();
         fcu $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fcy $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(zo.b));
            }
         }
      }

      return xv.i();
   }

   @Override
   public yj a(@Nullable ew $$0, @Nullable bvj $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xv.i();
      } else {
         fdb $$3 = this.a($$0);
         fdb $$4 = (fdb)($$1 != null && $$3.equals(fdb.cB) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hn, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}

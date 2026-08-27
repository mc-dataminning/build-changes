import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class xo implements wh {
   public static final MapCodec<xo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(xo::b), Codec.STRING.fieldOf("objective").forGetter(xo::d)).apply($$0, xo::new)
   );
   public static final MapCodec<xo> b = a.fieldOf("score");
   public static final wh.a<xo> c = new wh.a<>(b, "score");
   private final String d;
   @Nullable
   private final gi e;
   private final String f;

   @Nullable
   private static gi a(String $$0) {
      try {
         return new gj(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public xo(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public wh.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gi c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private etd a(du $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bpv> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw eh.a.create();
            }

            return $$1.get(0);
         }
      }

      return etd.c(this.d);
   }

   private wu a(etd $$0, du $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         ete $$3 = $$2.aK();
         esw $$4 = $$3.a(this.f);
         if ($$4 != null) {
            eta $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(xz.b));
            }
         }
      }

      return wg.i();
   }

   @Override
   public wu a(@Nullable du $$0, @Nullable bpv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wg.i();
      } else {
         etd $$3 = this.a($$0);
         etd $$4 = (etd)($$1 != null && $$3.equals(etd.cy) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xo $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      return 31 * $$0 + this.f.hashCode();
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.f + "'}";
   }
}

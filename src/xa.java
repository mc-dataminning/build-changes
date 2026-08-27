import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class xa implements vt {
   public static final MapCodec<xa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(xa::b), Codec.STRING.fieldOf("objective").forGetter(xa::d)).apply($$0, xa::new)
   );
   public static final MapCodec<xa> b = a.fieldOf("score");
   public static final vt.a<xa> c = new vt.a<>(b, "score");
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

   public xa(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public vt.a<?> a() {
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

   private epy a(du $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bof> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw eh.a.create();
            }

            return $$1.get(0);
         }
      }

      return epy.d(this.d);
   }

   private wg a(epy $$0, du $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         epz $$3 = $$2.aK();
         epr $$4 = $$3.a(this.f);
         if ($$4 != null) {
            epv $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(xl.b));
            }
         }
      }

      return vs.i();
   }

   @Override
   public wg a(@Nullable du $$0, @Nullable bof $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return vs.i();
      } else {
         epy $$3 = this.a($$0);
         epy $$4 = (epy)($$1 != null && $$3.equals(epy.cw) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xa $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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

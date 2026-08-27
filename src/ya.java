import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ya implements wt {
   public static final MapCodec<ya> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ya::b), Codec.STRING.fieldOf("objective").forGetter(ya::d)).apply($$0, ya::new)
   );
   public static final MapCodec<ya> b = a.fieldOf("score");
   public static final wt.a<ya> c = new wt.a<>(b, "score");
   private final String d;
   @Nullable
   private final gr e;
   private final String f;

   @Nullable
   private static gr a(String $$0) {
      try {
         return new gs(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public ya(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public wt.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gr c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private eui a(ec $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bql> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw ep.a.create();
            }

            return $$1.get(0);
         }
      }

      return eui.c(this.d);
   }

   private xg a(eui $$0, ec $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         euj $$3 = $$2.aK();
         eub $$4 = $$3.a(this.f);
         if ($$4 != null) {
            euf $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yl.b));
            }
         }
      }

      return ws.i();
   }

   @Override
   public xg a(@Nullable ec $$0, @Nullable bql $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return ws.i();
      } else {
         eui $$3 = this.a($$0);
         eui $$4 = (eui)($$1 != null && $$3.equals(eui.cz) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ya $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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

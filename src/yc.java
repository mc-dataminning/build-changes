import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class yc implements wv {
   public static final MapCodec<yc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(yc::b), Codec.STRING.fieldOf("objective").forGetter(yc::d)).apply($$0, yc::new)
   );
   public static final MapCodec<yc> b = a.fieldOf("score");
   public static final wv.a<yc> c = new wv.a<>(b, "score");
   private final String d;
   @Nullable
   private final hf e;
   private final String f;

   @Nullable
   private static hf a(String $$0) {
      try {
         return new hg(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public yc(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public wv.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public hf c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private exi a(eq $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bsg> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw fd.a.create();
            }

            return $$1.get(0);
         }
      }

      return exi.c(this.d);
   }

   private xi a(exi $$0, eq $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         exj $$3 = $$2.aL();
         exb $$4 = $$3.a(this.f);
         if ($$4 != null) {
            exf $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yn.b));
            }
         }
      }

      return wu.i();
   }

   @Override
   public xi a(@Nullable eq $$0, @Nullable bsg $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wu.i();
      } else {
         exi $$3 = this.a($$0);
         exi $$4 = (exi)($$1 != null && $$3.equals(exi.cA) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yc $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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

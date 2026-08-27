import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class wy implements vr {
   public static final MapCodec<wy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(wy::b), Codec.STRING.fieldOf("objective").forGetter(wy::d)).apply($$0, wy::new)
   );
   public static final MapCodec<wy> b = a.fieldOf("score");
   public static final vr.a<wy> c = new vr.a<>(b, "score");
   private final String d;
   @Nullable
   private final gg e;
   private final String f;

   @Nullable
   private static gg a(String $$0) {
      try {
         return new gh(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public wy(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public vr.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gg c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private epc a(du $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bnq> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw eh.a.create();
            }

            return $$1.get(0);
         }
      }

      return epc.d(this.d);
   }

   private we a(epc $$0, du $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         epd $$3 = $$2.aJ();
         eov $$4 = $$3.a(this.f);
         if ($$4 != null) {
            eoz $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(xj.b));
            }
         }
      }

      return vq.i();
   }

   @Override
   public we a(@Nullable du $$0, @Nullable bnq $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return vq.i();
      } else {
         epc $$3 = this.a($$0);
         epc $$4 = (epc)($$1 != null && $$3.equals(epc.cv) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wy $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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

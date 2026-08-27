import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class wd implements uw {
   private static final String d = "*";
   public static final MapCodec<wd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(wd::b), Codec.STRING.fieldOf("objective").forGetter(wd::d)).apply($$0, wd::new)
   );
   public static final MapCodec<wd> b = a.fieldOf("score");
   public static final uw.a<wd> c = new uw.a<>(b, "score");
   private final String e;
   @Nullable
   private final ge f;
   private final String g;

   @Nullable
   private static ge a(String $$0) {
      try {
         return new gf(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public wd(String $$0, String $$1) {
      this.e = $$0;
      this.f = a($$0);
      this.g = $$1;
   }

   @Override
   public uw.a<?> a() {
      return c;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public ge c() {
      return this.f;
   }

   public String d() {
      return this.g;
   }

   private String a(du $$0) throws CommandSyntaxException {
      if (this.f != null) {
         List<? extends bkv> $$1 = this.f.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw eg.a.create();
            }

            return $$1.get(0).cy();
         }
      }

      return this.e;
   }

   private String a(String $$0, du $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         eky $$3 = $$2.aH();
         ekv $$4 = $$3.b(this.g);
         if ($$4 != null && $$3.b($$0, $$4)) {
            ekx $$5 = $$3.c($$0, $$4);
            return Integer.toString($$5.b());
         }
      }

      return "";
   }

   @Override
   public vj a(@Nullable du $$0, @Nullable bkv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return uv.i();
      } else {
         String $$3 = this.a($$0);
         String $$4 = $$1 != null && $$3.equals("*") ? $$1.cy() : $$3;
         return uv.b(this.a($$4, $$0));
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wd $$1 && this.e.equals($$1.e) && this.g.equals($$1.g)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.e.hashCode();
      return 31 * $$0 + this.g.hashCode();
   }

   @Override
   public String toString() {
      return "score{name='" + this.e + "', objective='" + this.g + "'}";
   }
}

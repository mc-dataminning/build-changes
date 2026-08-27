import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class iz implements it {
   public static final Codec<iz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djx.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, iz::new)
   );
   public static final it.a<iz> b = new it.a<iz>() {
      public iz a(iu<iz> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         gw $$6 = gw.a((double)$$2, (double)$$3, (double)$$4);
         return new iz(new djp($$6), $$5);
      }

      public iz a(iu<iz> $$0, so $$1) {
         djx $$2 = djy.c($$1);
         int $$3 = $$1.m();
         return new iz($$2, $$3);
      }
   };
   private final djx c;
   private final int d;

   public iz(djx $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(so $$0) {
      djy.a(this.c, $$0);
      $$0.c(this.d);
   }

   @Override
   public String a() {
      ehn $$0 = this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", jb.k.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public iu<iz> b() {
      return iv.P;
   }

   public djx c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}

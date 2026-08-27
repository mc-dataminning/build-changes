import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class la implements ku {
   public static final Codec<la> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duv.c.fieldOf("destination").forGetter(la::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(la::c)).apply($$0, la::new)
   );
   public static final yq<wd, la> b = yq.a(duv.d, la::b, yo.f, la::c, la::new);
   public static final ku.a<la> c = new ku.a<la>() {
      public la a(kv<la> $$0, StringReader $$1, ix.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$5 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$6 = $$1.readInt();
         im $$7 = im.a((double)$$3, (double)$$4, (double)$$5);
         return new la(new dun($$7), $$6);
      }
   };
   private final duv d;
   private final int e;

   public la(duv $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public String a(ix.a $$0) {
      etf $$1 = this.d.a(null).get();
      double $$2 = $$1.a();
      double $$3 = $$1.b();
      double $$4 = $$1.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", lc.j.b(this.a()), $$2, $$3, $$4, this.e);
   }

   @Override
   public kv<la> a() {
      return kw.R;
   }

   public duv b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}

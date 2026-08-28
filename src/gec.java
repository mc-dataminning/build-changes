import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gec {
   public final Int2ObjectMap<gry> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<grr> b = new Int2ObjectOpenHashMap(256);
   private final grx c;

   public gec(grx $$0) {
      this.c = $$0;
   }

   public grr a(cud $$0) {
      grr $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public grr a(cty $$0) {
      return (grr)this.b.get(b($$0));
   }

   private static int b(cty $$0) {
      return cty.a($$0);
   }

   public void a(cty $$0, gry $$1) {
      this.a.put(b($$0), $$1);
   }

   public grx a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gry> $$0 = (Entry<Integer, gry>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}

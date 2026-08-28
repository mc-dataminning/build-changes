import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gdg {
   public final Int2ObjectMap<grc> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gqv> b = new Int2ObjectOpenHashMap(256);
   private final grb c;

   public gdg(grb $$0) {
      this.c = $$0;
   }

   public gqv a(cuk $$0) {
      gqv $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gqv a(cuf $$0) {
      return (gqv)this.b.get(b($$0));
   }

   private static int b(cuf $$0) {
      return cuf.a($$0);
   }

   public void a(cuf $$0, grc $$1) {
      this.a.put(b($$0), $$1);
   }

   public grb a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, grc> $$0 = (Entry<Integer, grc>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}

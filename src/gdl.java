import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gdl {
   public final Int2ObjectMap<grh> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gra> b = new Int2ObjectOpenHashMap(256);
   private final grg c;

   public gdl(grg $$0) {
      this.c = $$0;
   }

   public gra a(cup $$0) {
      gra $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gra a(cuk $$0) {
      return (gra)this.b.get(b($$0));
   }

   private static int b(cuk $$0) {
      return cuk.a($$0);
   }

   public void a(cuk $$0, grh $$1) {
      this.a.put(b($$0), $$1);
   }

   public grg a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, grh> $$0 = (Entry<Integer, grh>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}

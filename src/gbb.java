import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gbb {
   public final Int2ObjectMap<gov> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<goo> b = new Int2ObjectOpenHashMap(256);
   private final gou c;

   public gbb(gou $$0) {
      this.c = $$0;
   }

   public goo a(csd $$0) {
      goo $$1 = this.a($$0.f());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public goo a(cry $$0) {
      return (goo)this.b.get(b($$0));
   }

   private static int b(cry $$0) {
      return cry.a($$0);
   }

   public void a(cry $$0, gov $$1) {
      this.a.put(b($$0), $$1);
   }

   public gou a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gov> $$0 = (Entry<Integer, gov>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class geu {
   public final Int2ObjectMap<gss> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gsk> b = new Int2ObjectOpenHashMap(256);
   private final gsr c;

   public geu(gsr $$0) {
      this.c = $$0;
   }

   public gsk a(cuq $$0) {
      gsk $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gsk a(cul $$0) {
      return (gsk)this.b.get(b($$0));
   }

   private static int b(cul $$0) {
      return cul.a($$0);
   }

   public void a(cul $$0, gss $$1) {
      this.a.put(b($$0), $$1);
   }

   public gsr a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gss> $$0 = (Entry<Integer, gss>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}

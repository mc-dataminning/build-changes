import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fxn {
   public final Int2ObjectMap<glg> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gkz> b = new Int2ObjectOpenHashMap(256);
   private final glf c;

   public fxn(glf $$0) {
      this.c = $$0;
   }

   public gkz a(cqk $$0) {
      gkz $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gkz a(cqf $$0) {
      return (gkz)this.b.get(b($$0));
   }

   private static int b(cqf $$0) {
      return cqf.a($$0);
   }

   public void a(cqf $$0, glg $$1) {
      this.a.put(b($$0), $$1);
   }

   public glf a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, glg> $$0 = (Entry<Integer, glg>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}

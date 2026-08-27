import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fxp {
   public final Int2ObjectMap<glj> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<glc> b = new Int2ObjectOpenHashMap(256);
   private final gli c;

   public fxp(gli $$0) {
      this.c = $$0;
   }

   public glc a(cqm $$0) {
      glc $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public glc a(cqh $$0) {
      return (glc)this.b.get(b($$0));
   }

   private static int b(cqh $$0) {
      return cqh.a($$0);
   }

   public void a(cqh $$0, glj $$1) {
      this.a.put(b($$0), $$1);
   }

   public gli a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, glj> $$0 = (Entry<Integer, glj>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}

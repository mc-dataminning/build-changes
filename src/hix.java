import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hix extends ave<hiy> {
   public static final hiy a = new hiy(Map.of());
   private static final akw b = akw.a("equipment");
   private Map<alc<dga>, hiy> c = Map.of();

   public hix() {
      super(hiy.a, b);
   }

   protected void a(Map<ald, hiy> $$0, ava $$1, bqb $$2) {
      this.c = $$0.entrySet().stream().collect(Collectors.toUnmodifiableMap($$0x -> alc.a(dgb.a, (ald)$$0x.getKey()), Entry::getValue));
   }

   public hiy a(alc<dga> $$0) {
      return this.c.getOrDefault($$0, a);
   }
}

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hd {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("arguments.item.overstacked", $$0, $$1));
   private final jm<cuj> b;
   private final kn c;

   public hd(jm<cuj> $$0, kn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cuj a() {
      return this.b.a();
   }

   public cuo a(int $$0, boolean $$1) throws CommandSyntaxException {
      cuo $$2 = new cuo(this.b, $$0);
      $$2.b(this.c);
      if ($$1 && $$0 > $$2.j()) {
         throw a.create(this.b(), $$2.j());
      } else {
         return $$2;
      }
   }

   public String a(jo.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(jo.a $$0) {
      DynamicOps<ux> $$1 = $$0.a(uo.a);
      return this.c.b().stream().flatMap($$1x -> {
         kp<?> $$2 = (kp<?>)$$1x.getKey();
         akq $$3 = lt.aq.b($$2);
         if ($$3 == null) {
            return Stream.empty();
         } else {
            Optional<?> $$4 = (Optional<?>)$$1x.getValue();
            if ($$4.isPresent()) {
               ks<?> $$5 = ks.a($$2, $$4.get());
               return $$5.a($$1).result().stream().map($$1xx -> $$3.toString() + "=" + $$1xx);
            } else {
               return Stream.of("!" + $$3.toString());
            }
         }
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(akp::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class he {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("arguments.item.overstacked", $$0, $$1));
   private final jo<cvn> b;
   private final kp c;

   public he(jo<cvn> $$0, kp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cvn a() {
      return this.b.a();
   }

   public cvs a(int $$0, boolean $$1) throws CommandSyntaxException {
      cvs $$2 = new cvs(this.b, $$0);
      $$2.b(this.c);
      if ($$1 && $$0 > $$2.k()) {
         throw a.create(this.b(), $$2.k());
      } else {
         return $$2;
      }
   }

   public String a(jq.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(jq.a $$0) {
      DynamicOps<vd> $$1 = $$0.a(uu.a);
      return this.c.b().stream().flatMap($$1x -> {
         kr<?> $$2 = (kr<?>)$$1x.getKey();
         ale $$3 = lv.ap.b($$2);
         if ($$3 == null) {
            return Stream.empty();
         } else {
            Optional<?> $$4 = (Optional<?>)$$1x.getValue();
            if ($$4.isPresent()) {
               ku<?> $$5 = ku.a($$2, $$4.get());
               return $$5.a($$1).result().stream().map($$1xx -> $$3.toString() + "=" + $$1xx);
            } else {
               return Stream.of("!" + $$3.toString());
            }
         }
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(ald::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}

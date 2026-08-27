import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gr {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("arguments.item.overstacked", $$0, $$1));
   private final ja<cuc> b;
   private final ka c;

   public gr(ja<cuc> $$0, ka $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cuc a() {
      return this.b.a();
   }

   public cuh a(int $$0, boolean $$1) throws CommandSyntaxException {
      cuh $$2 = new cuh(this.b, $$0);
      if ($$1 && $$0 > $$2.i()) {
         throw a.create(this.b(), $$2.i());
      } else {
         $$2.a(this.c);
         return $$2;
      }
   }

   public String a(jc.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(jc.a $$0) {
      DynamicOps<vh> $$1 = $$0.a(uy.a);
      return this.c.c().flatMap($$1x -> {
         kd<?> $$2 = $$1x.a();
         akt $$3 = lh.as.b($$2);
         Optional<vh> $$4 = $$1x.a($$1).result();
         return $$3 != null && !$$4.isEmpty() ? Stream.of($$3.toString() + "=" + $$4.get()) : Stream.empty();
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(aks::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gd {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("arguments.item.overstacked", $$0, $$1));
   private final in<crn> b;
   private final jn c;

   public gd(in<crn> $$0, jn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public crn a() {
      return this.b.a();
   }

   public crs a(int $$0, boolean $$1) throws CommandSyntaxException {
      crs $$2 = new crs(this.b, $$0);
      if ($$1 && $$0 > $$2.i()) {
         throw a.create(this.b(), $$2.i());
      } else {
         $$2.a(this.c);
         return $$2;
      }
   }

   public String a(ip.a $$0) {
      StringBuilder $$1 = new StringBuilder(this.b());
      String $$2 = this.b($$0);
      if (!$$2.isEmpty()) {
         $$1.append('[');
         $$1.append($$2);
         $$1.append(']');
      }

      return $$1.toString();
   }

   private String b(ip.a $$0) {
      DynamicOps<ul> $$1 = $$0.a(uc.a);
      return this.c.c().flatMap($$1x -> {
         jq<?> $$2 = $$1x.a();
         ajv $$3 = kt.as.b($$2);
         Optional<ul> $$4 = $$1x.a($$1).result();
         return $$3 != null && !$$4.isEmpty() ? Stream.of($$3.toString() + "=" + $$4.get()) : Stream.empty();
      }).collect(Collectors.joining(String.valueOf(',')));
   }

   private String b() {
      return this.b.e().map(aju::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}

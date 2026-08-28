import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class uv {
   static final bpw<CommandSyntaxException> e = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_string_uuid")));
   static final bpw<CommandSyntaxException> f = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_number_or_boolean")));
   public static final String a = "true";
   public static final String b = "false";
   public static final Map<uv.a, uv.b> c = Map.of(new uv.a("bool", 1), new uv.b() {
      @Override
      public <T> T a(DynamicOps<T> $$0, List<T> $$1, bqb<StringReader> $$2) {
         Boolean $$3 = a($$0, $$1.getFirst());
         if ($$3 == null) {
            $$2.b().a($$2.g(), uv.f);
            return null;
         } else {
            return (T)$$0.createBoolean($$3);
         }
      }

      @Nullable
      private static <T> Boolean a(DynamicOps<T> $$0, T $$1) {
         Optional<Boolean> $$2 = $$0.getBooleanValue($$1).result();
         if ($$2.isPresent()) {
            return $$2.get();
         } else {
            Optional<Number> $$3 = $$0.getNumberValue($$1).result();
            return $$3.isPresent() ? $$3.get().doubleValue() != 0.0 : null;
         }
      }
   }, new uv.a("uuid", 1), new uv.b() {
      @Override
      public <T> T a(DynamicOps<T> $$0, List<T> $$1, bqb<StringReader> $$2) {
         Optional<String> $$3 = $$0.getStringValue($$1.getFirst()).result();
         if ($$3.isEmpty()) {
            $$2.b().a($$2.g(), uv.e);
            return null;
         } else {
            UUID $$4;
            try {
               $$4 = UUID.fromString($$3.get());
            } catch (IllegalArgumentException var7) {
               $$2.b().a($$2.g(), uv.e);
               return null;
            }

            return (T)$$0.createIntList(IntStream.of(ka.a($$4)));
         }
      }
   });
   public static final bqe<StringReader> d = new bqe<StringReader>() {
      private final Set<String> a = Stream.concat(Stream.of("false", "true"), uv.c.keySet().stream().map(uv.a::a)).collect(Collectors.toSet());

      @Override
      public Stream<String> possibleValues(bqb<StringReader> $$0) {
         return this.a.stream();
      }
   };

   public static record a(String a, int b) {
      @Override
      public String toString() {
         return this.a + "/" + this.b;
      }
   }

   public interface b {
      @Nullable
      <T> T a(DynamicOps<T> var1, List<T> var2, bqb<StringReader> var3);
   }
}

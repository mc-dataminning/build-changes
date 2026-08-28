import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.JavaOps;
import java.util.Collection;
import java.util.List;

public class fw extends bql<xz> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xc.b("argument.style.invalid", $$0));
   private static final bqg<Object> c = uu.a(JavaOps.INSTANCE);

   private fw(ji.a $$0) {
      super(c.a($$0.a(JavaOps.INSTANCE), c, xz.b.b, a));
   }

   public static xz a(CommandContext<ek> $$0, String $$1) {
      return (xz)$$0.getArgument($$1, xz.class);
   }

   public static fw a(eg $$0) {
      return new fw($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}

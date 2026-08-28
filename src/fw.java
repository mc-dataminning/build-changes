import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;

public class fw extends bqu<yd> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("argument.style.invalid", $$0));
   private static final DynamicOps<va> c = uo.a;
   private static final bqp<va> d = uu.a(c);

   private fw(ji.a $$0) {
      super(d.a($$0.a(c), d, yd.b.b, a));
   }

   public static yd a(CommandContext<ek> $$0, String $$1) {
      return (yd)$$0.getArgument($$1, yd.class);
   }

   public static fw a(eg $$0) {
      return new fw($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
